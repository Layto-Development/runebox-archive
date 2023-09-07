package io.runebox.internal.deobfuscator.ast.transformer

import com.github.javaparser.ast.expr.UnaryExpr
import io.runebox.internal.deobfuscator.ast.AstTransformer
import io.runebox.internal.deobfuscator.ast.Module
import io.runebox.internal.deobfuscator.ast.util.isIntegerOrLongLiteral
import io.runebox.internal.deobfuscator.ast.util.negate
import io.runebox.internal.deobfuscator.ast.util.walk
import org.tinylog.kotlin.Logger

class NegativeLiteralTransformer : AstTransformer {

    private var count = 0

    override fun run(module: Module) {
        for(unit in module) {
            unit.walk { expr: UnaryExpr ->
                val operand = expr.expression
                if (!operand.isIntegerOrLongLiteral()) {
                    return@walk
                }

                count++
                when (expr.operator) {
                    UnaryExpr.Operator.PLUS -> expr.replace(operand)
                    UnaryExpr.Operator.MINUS -> expr.replace(operand.negate())
                    else -> { count-- }
                }
            }
        }

        Logger.info("Replaced $count negative literal expressions.")
    }
}